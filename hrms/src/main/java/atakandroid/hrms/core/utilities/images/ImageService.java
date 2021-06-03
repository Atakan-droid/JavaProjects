package atakandroid.hrms.core.utilities.images;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import atakandroid.hrms.core.utilities.results.DataResult;

public interface ImageService {

	 DataResult<?> upload(MultipartFile multipartFile) throws IOException;
	    DataResult<?> delete(int id) throws IOException;
}
