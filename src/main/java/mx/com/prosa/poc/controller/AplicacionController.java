package mx.com.prosa.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.prosa.poc.controller.aspect.BusinessExceptionInterceptor;
import mx.com.prosa.poc.service.AplicacionesService;
import mx.com.prosa.poc.to.ActoresTO;
import mx.com.prosa.poc.to.AplicacionTO;
import mx.com.prosa.poc.to.BaseTO;
import mx.com.prosa.poc.to.ITServiceTO;
import mx.com.prosa.poc.to.Response;

/**
 * Controlador para el CRUD de las Aplicaciones
 * 
 * @author Guillermo Segura Olivera <guillermo.segura@axity.com>
 */
@RestController
@RequestMapping("/v1/aplicacion")
@BusinessExceptionInterceptor
@CrossOrigin
public class AplicacionController extends AbstractBaseController 
{
	
	@Autowired
	AplicacionesService aplicacionesService;

  /**
   * Guarda un Servicio de TI
   * 
   * @param request
   * @return
   */
  // TODO agregar informacion de swagger
  @PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Response<AplicacionTO>> save( @RequestBody AplicacionTO request )
  {
	  aplicacionesService.save(request);
	  
	    Response<AplicacionTO> response = new Response<>();
	    response.setCode( HttpStatus.CREATED.value() );
	    response.setMessage( HttpStatus.CREATED.name() );
	    response.setResponse( request );

	    return new ResponseEntity<>( response, HttpStatus.CREATED );
	  
  }
  
  
	/**
	 * Delete.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<BaseTO>> delete(@PathVariable(value = "id") Long id) {

		ITServiceTO request = new ITServiceTO();
		request.setIp(super.getIpAddress());
		request.setUser(super.getUser());
		request.setId(id);

		this.aplicacionesService.delete(id);

		Response<BaseTO> response = new Response<>();
		response.setCode(HttpStatus.OK.value());
		response.setMessage(HttpStatus.OK.name());

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	
	
	/**
	 * Edits the patch.
	 *
	 * @param request the request
	 * @param id the id
	 * @return the response entity
	 */
	@PatchMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<AplicacionTO>> editPatch(@RequestBody AplicacionTO request,
			@PathVariable(value = "id") Long id) {
		request.setIp(super.getIpAddress());
		request.setUser(super.getUser());
		request.setId(id);

		this.aplicacionesService.edit(request);

		Response<AplicacionTO> response = new Response<>();
		response.setCode(HttpStatus.OK.value());
		response.setMessage(HttpStatus.OK.name());
		response.setResponse(request);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}


	@Override
	protected String[] getParameters() {
		// TODO Auto-generated method stub
		return null;
	}




}
