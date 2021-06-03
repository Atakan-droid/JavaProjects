/* package atakandroid.hrms.core.utilities.images.claudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import atakandroid.hrms.core.utilities.images.ImageService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;

@Service
public class ClaudinaryManager implements ImageService {
	
	 private final Cloudinary cloudinary;

	    @Autowired
	    public ClaudinaryManager() {
	    	
	        Map<String, String> values = new HashMap<>();
	        var environment = new Environment();

	        values.put("cloud_name", environment.getCloudName());
	        values.put("api_key", environment.getApiKey());
	        values.put("api_secret", environment.getApiSecret());

	        this.cloudinary = new Cloudinary(values);
	    }

	    public DataResult<?> upload(MultipartFile multipartFile) throws IOException {
	        var result = this.cloudinary.uploader().upload(multipartFile.getBytes(), ObjectUtils.emptyMap());
	        return new SuccessDataResult<>(result);
	    }

	    public DataResult<?> delete(int id) throws IOException {
	        var result = this.cloudinary.uploader().upload(id, ObjectUtils.emptyMap());
	        return new SuccessDataResult<>(result);
	    }
	
} */
