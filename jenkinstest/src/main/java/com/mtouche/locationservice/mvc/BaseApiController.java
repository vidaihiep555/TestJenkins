package com.mtouche.locationservice.mvc;

import java.io.FileNotFoundException;

import com.mtouche.locationservice.model.ApiResponse;
import com.mtouche.locationservice.model.ApiResponseStatus;

/**
 * The Base Controller of all other API Controllers
 *
 * @author Vidal
 * @version 1.0.0
 */
public class BaseApiController {
    protected ApiResponse fileNotFoundResponse(ApiResponse response, FileNotFoundException ex){
        response.setMessage("Return Not Found");
        response.setStatus(ApiResponseStatus.FAIL);
        return response;
    }

    protected ApiResponse invalidIPResponse(ApiResponse response, Exception ex){
        response.setMessage("Invalid IP Exception: ");
        response.setStatus(ApiResponseStatus.FAIL);
        return response;
    }

    protected ApiResponse exceptionOccurResponse(ApiResponse response, Exception ex, String apiName) {
        response.setStatus(ApiResponseStatus.FAIL);
        response.setMessage("Return Not Found");
        return response;
    }

    protected ApiResponse checkingTypeNotFoundResponse(ApiResponse response){
        response.setStatus(ApiResponseStatus.FAIL);
        response.setMessage("Checking Type Not Found");
        return response;
    }

    protected ApiResponse locationNotFoundResponse(ApiResponse response){
        response.setStatus(ApiResponseStatus.FAIL);
        response.setMessage("Return Not Found");
        return response;
    }
}
