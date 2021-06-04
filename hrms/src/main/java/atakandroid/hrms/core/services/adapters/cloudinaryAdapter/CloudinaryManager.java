package atakandroid.hrms.core.services.adapters.cloudinaryAdapter;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorDataResult;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryManager implements CloudinaryService  {

	private Cloudinary cloudinary;

	public CloudinaryManager() {
		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "ddnscmo6g",
				"api_key", "596729127544394",
				"api_secret", "Ig6ghveKrCu8KY5qb0D1faMjQnk"
				));
	}
	@Override
	public DataResult<Map> uploadImage(MultipartFile filePath) {
		
		Map<String, String> result;
		try {
			result = (Map<String,String>)cloudinary.uploader().upload(filePath.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ErrorDataResult<Map>();
	}

}
