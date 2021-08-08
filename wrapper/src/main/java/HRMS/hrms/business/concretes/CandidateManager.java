package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.business.abstracts.CandidatesService;
import HRMS.hrms.dataAccess.abstracts.CandidatesDao;
import HRMS.hrms.entities.concretes.Candidates;
@Service
public class CandidateManager implements CandidatesService {
	
	private CandidatesDao candidatesDao;
	
	@Autowired
	public CandidateManager(CandidatesDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}

	@Override
	public List<Candidates> getAll() {
		
		return this.candidatesDao.findAll();
	}

}
