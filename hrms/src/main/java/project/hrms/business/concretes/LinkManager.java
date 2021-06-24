package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.LinkService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.LinkDao;
import project.hrms.entities.concretes.Link;

@Service
public class LinkManager implements LinkService{

	private LinkDao linkDao;
	
	@Autowired
	public LinkManager(LinkDao linkDao) {
		super();
		this.linkDao = linkDao;
	}

	@Override
	public DataResult<List<Link>> getAllByCandidateId(int id) {
		return new SuccessDataResult<List<Link>>
		(this.linkDao.findAllByCandidate_id(id));

		
	}

	@Override
	public Result add(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("Link eklendi.");
	}

	@Override
	public Result update(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("Link güncellendi.");
	}

	@Override
	public Result delete(Link link) {
		this.linkDao.delete(link);
		return new SuccessResult("Link silindi.");
	}

	@Override
	public DataResult<List<Link>> getAll() {
		return new SuccessDataResult<List<Link>>
		(this.linkDao.findAll());
	}

}
