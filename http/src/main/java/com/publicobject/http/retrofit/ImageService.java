package com.publicobject.http.retrofit;

import java.util.List;
import retrofit.http.GET;
import retrofit.http.Path;

public interface ImageService {
  @GET("/{directory}")
  List<String> listImages(@Path("directory") String directory);
}
