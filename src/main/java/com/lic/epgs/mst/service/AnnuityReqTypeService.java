package com.lic.epgs.mst.service;

import java.util.List;

import com.lic.epgs.mst.entity.AnnuityReqType;
import com.lic.epgs.mst.exceptionhandling.AnnuityReqTypeServiceException;
import com.lic.epgs.mst.exceptionhandling.ResourceNotFoundException;

public interface AnnuityReqTypeService {

	List<AnnuityReqType> getAllAnnuity() throws ResourceNotFoundException, AnnuityReqTypeServiceException;

	public AnnuityReqType getAnnuityById(long annuityId);

	public AnnuityReqType getAnnuityByCode(String code);

	// New method to get annuity by name
	public AnnuityReqType getAnnuityByName(String name) throws ResourceNotFoundExceptionbyname;
}
