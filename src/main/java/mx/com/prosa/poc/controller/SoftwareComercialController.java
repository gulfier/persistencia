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
import mx.com.prosa.poc.service.SoftwareComercialService;
import mx.com.prosa.poc.to.BaseTO;
import mx.com.prosa.poc.to.Response;
import mx.com.prosa.poc.to.SoftwareComercialTO;

/**
 * The Class SoftwareComercialController.
 */
@RestController
@RequestMapping("/v1/software")
@BusinessExceptionInterceptor
@CrossOrigin
public class SoftwareComercialController extends AbstractBaseController {

	/** The software comercial service. */
	@Autowired
	private SoftwareComercialService softwareComercialService;

	/**
	 * Save.
	 *
	 * @param request the request
	 * @return the response entity
	 */
	@PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<SoftwareComercialTO>> save(  @RequestBody SoftwareComercialTO request) {

		request.setIp( super.getIpAddress() );
	    request.setUser( super.getUser() );
	    
	    this.softwareComercialService.save( request );

	    Response<SoftwareComercialTO> response = new Response<>();
	    response.setCode( HttpStatus.CREATED.value() );
	    response.setMessage( HttpStatus.CREATED.name() );
	    response.setResponse( request );

	    return new ResponseEntity<>( response, HttpStatus.CREATED );
	}
	
	/**
	 * Edits the patch.
	 *
	 * @param request the request
	 * @param id the id
	 * @return the response entity
	 */
	@PatchMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<SoftwareComercialTO>> editPatch(@RequestBody SoftwareComercialTO request,
			@PathVariable(value = "id") Long id) {
		request.setIp(super.getIpAddress());
		request.setUser(super.getUser());
		request.setId(id);

		this.softwareComercialService.edit(request);

		Response<SoftwareComercialTO> response = new Response<>();
		response.setCode(HttpStatus.OK.value());
		response.setMessage(HttpStatus.OK.name());
		response.setResponse(request);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<BaseTO>> delete(@PathVariable(value = "id") Long id) {

		SoftwareComercialTO request = new SoftwareComercialTO();
		request.setIp(super.getIpAddress());
		request.setUser(super.getUser());
		request.setId(id);

		this.softwareComercialService.delete(id);

		Response<BaseTO> response = new Response<>();
		response.setCode(HttpStatus.OK.value());
		response.setMessage(HttpStatus.OK.name());

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	/**
	 * Gets the parameters.
	 *
	 * @return the parameters
	 */
	@Override
	protected String[] getParameters() {
		return null;
	}

}
