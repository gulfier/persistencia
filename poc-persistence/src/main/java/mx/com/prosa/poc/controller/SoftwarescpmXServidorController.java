package mx.com.prosa.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.prosa.poc.controller.aspect.BusinessExceptionInterceptor;
import mx.com.prosa.poc.service.SoftwarescomXServidorService;
import mx.com.prosa.poc.to.Response;
import mx.com.prosa.poc.to.SoftwarescomXServidorTO;

// TODO: Auto-generated Javadoc
/**
 * The Class SoftwarescpmXServidorController.
 */
@RestController
@RequestMapping("/v1/softwareServer")
@BusinessExceptionInterceptor
@CrossOrigin
public class SoftwarescpmXServidorController extends AbstractBaseController {
	
	/** The softwarescom X servidor service. */
	@Autowired
	private SoftwarescomXServidorService softwarescomXServidorService;

	/**
	 * Save.
	 *
	 * @param request the request
	 * @return the response entity
	 */
	@PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<SoftwarescomXServidorTO>> save(  @RequestBody SoftwarescomXServidorTO request) {

		request.setIp( super.getIpAddress() );
	    request.setUser( super.getUser() );
	    
	    this.softwarescomXServidorService.save( request );

	    Response<SoftwarescomXServidorTO> response = new Response<>();
	    response.setCode( HttpStatus.CREATED.value() );
	    response.setMessage( HttpStatus.CREATED.name() );
	    response.setResponse( request );

	    return new ResponseEntity<>( response, HttpStatus.CREATED );
	}

	/**
	 * Gets the parameters.
	 *
	 * @return the parameters
	 */
	@Override
	protected String[] getParameters() {
		// TODO Auto-generated method stub
		return null;
	}
	
}