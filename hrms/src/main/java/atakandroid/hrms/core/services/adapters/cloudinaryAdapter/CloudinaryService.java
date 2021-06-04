package atakandroid.hrms.core.services.adapters.cloudinaryAdapter;

import java.util.Map;
import org.springframework.web.multipart.MultipartFile;

import atakandroid.hrms.core.utilities.results.DataResult;

public interface CloudinaryService {

	DataResult<Map> uploadImage(MultipartFile filePath);
}
