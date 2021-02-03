package mx.com.prosa.poc.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.prosa.poc.model.TblAplicaciones;
import mx.com.prosa.poc.model.TblAplicacionesXServidor;
import mx.com.prosa.poc.model.TblAppsXServApp;
import mx.com.prosa.poc.model.TblServiciosAplicativo;
import mx.com.prosa.poc.persistence.TblAplicacionesRepository;
import mx.com.prosa.poc.persistence.TblAppsXServAppRepository;
import mx.com.prosa.poc.persistence.TblServiciosAplicativoRepository;
import mx.com.prosa.poc.service.AppsXServAppService;
import mx.com.prosa.poc.to.AplicacionesXServidorTO;
import mx.com.prosa.poc.to.AplicacionesXservidorEdithTO;
import mx.com.prosa.poc.to.AppXservicioEdithTO;
import mx.com.prosa.poc.to.AppsXServAppTO;
import mx.com.prosa.poc.util.BaseTOValidationUtil;
import mx.com.prosa.poc.util.SupplierBusinessException;

// TODO: Auto-generated Javadoc
/**
 * The Class AppsXServAppServiceImpl.
 */
@Service
public class AppsXServAppServiceImpl implements AppsXServAppService {

	/** The tbl aplicaciones repository. */
	@Autowired
	private TblAplicacionesRepository tblAplicacionesRepository;
	
	/** The tbl servicios aplicativo repository. */
	@Autowired
	private TblServiciosAplicativoRepository tblServiciosAplicativoRepository;
	
	/** The tbl apps X serv app repository. */
	@Autowired
	private TblAppsXServAppRepository tblAppsXServAppRepository;
	
	/**
	 * Save.
	 *
	 * @param appDataBase the app data base
	 */
	@Override
	public void save(AppsXServAppTO appDataBase) {
		TblAppsXServApp entity = new TblAppsXServApp();
		TblAplicaciones app = tblAplicacionesRepository.findById(appDataBase.getFkIdAplicacion())
				.orElseThrow(SupplierBusinessException.APP_NOT_FOUND);
		entity.setFkIdAplicacion(app.getPkIdAplicacion());
		entity.setTblAplicaciones(app);
		TblServiciosAplicativo serviceApp = tblServiciosAplicativoRepository.findById(appDataBase.getFkIdServicio())
				.orElseThrow(SupplierBusinessException.APP_NOT_FOUND);
		entity.setFkIdServicio(serviceApp.getPkIdServicio());
		entity.setTblServiciosAplicativo(serviceApp);
		tblAppsXServAppRepository.save(entity);
	}
	
	
	
	@Override
	public Boolean edit(AppXservicioEdithTO object) {
		BaseTOValidationUtil.validateIdNotNull( object );
		TblAppsXServApp entity = this.tblAppsXServAppRepository.
				findTable(object.getTable().getFkIdAplicacion(),object.getTable().getFkIdServicio()).orElseThrow(SupplierBusinessException.APP_NOT_FOUND);
	    
		Optional<TblAppsXServApp> entityUpdated = this.tblAppsXServAppRepository.
				findTable(object.getUpdate().getFkIdAplicacion(),object.getUpdate().getFkIdServicio());
		
		if(!entityUpdated.isPresent()) {
			entity.setFkIdAplicacion(object.getUpdate().getFkIdAplicacion());
			entity.setFkIdServicio(object.getUpdate().getFkIdServicio());
			this.tblAppsXServAppRepository.save( entity );
		    this.tblAppsXServAppRepository.flush();
		}
		return true;
	}
	
	
	@Override
	public Boolean delete(AppsXServAppTO request) {
		// TODO Auto-generated method stub
		tblAppsXServAppRepository.delete(tblAppsXServAppRepository.
				findTable(request.getFkIdAplicacion(),request.getFkIdServicio()).orElseThrow(SupplierBusinessException.APP_NOT_FOUND));
		return true;
	}

}
