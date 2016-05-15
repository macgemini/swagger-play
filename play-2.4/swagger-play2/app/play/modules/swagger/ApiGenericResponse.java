package play.modules.swagger;

import io.swagger.annotations.ApiResponse;

/**
 * Created by mac on 15.05.16.
 */
public interface ApiGenericResponse extends ApiResponse {
    /**
     * Returns the generic type of a response as a string
     * @return generic type as a string from a response
     */
    String getGenericType();
}
