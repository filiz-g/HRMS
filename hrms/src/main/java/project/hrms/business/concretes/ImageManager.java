package project.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import project.hrms.business.abstracts.ImageService;
import project.hrms.core.utilities.image.ImageUploadService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.ImageDao;
import project.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{

	private ImageDao imageDao;
	private ImageUploadService imageUploadService;
	
	@Autowired
	public ImageManager(ImageDao imageDao, ImageUploadService imageUploadService) {
		super();
		this.imageDao = imageDao;
		this.imageUploadService = imageUploadService;
	}

	@Override
	public DataResult<Image> getByCandidateId(int id) {
		return new SuccessDataResult<Image>
		(this.imageDao.findByCandidate_id(id));

	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>
		(this.imageDao.findAll());

	}

	@Override
	public DataResult<Image> getById(int id) {
		return new SuccessDataResult<Image>
		(this.imageDao.findById(id));

	}

	@Override
	public Result add(Image image, MultipartFile imageFile) {
		
		Map<String,String> uploadImage = this.imageUploadService.uploadImageFile(imageFile).getData();
		image.setUrlAddress(uploadImage.get("url"));
		this.imageDao.save(image);
		return new SuccessResult("Fotoğraf eklendi.");
		
	}

	@Override
	public Result update(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Fotoğraf güncellendi.");
	}

	@Override
	public Result delete(Image image) {
		this.imageDao.delete(image);
		return new SuccessResult("Fotğraf silindi.");
	}

}
