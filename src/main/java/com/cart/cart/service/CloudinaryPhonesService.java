
package com.cart.cart.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CloudinaryPhonesService  {
    
    Cloudinary cloudinary;
    
    private Map<String,String> valuesMap = new HashMap<>();
    
    public CloudinaryPhonesService(){
        valuesMap.put("cloud_name", "dpvdcnhcf");
        valuesMap.put("api_key", "746445121885216");
        valuesMap.put("api_secret", "MwKCNnaddlUlGyk-fV2CUOB2-60");
    cloudinary= new Cloudinary(valuesMap);
    }
    
    public Map upload(MultipartFile multipartFile) throws IOException{
          File file = convert(multipartFile);
    Map<String, Object> params = new HashMap<>();
    params.put("public_id", "carrito phones/" + multipartFile.getOriginalFilename()); // Ruta de la carpeta en Cloudinary
    Map result = cloudinary.uploader().upload(file, params);
    file.delete();
       
        return result;
        
    }
    public Map delete(String id) throws IOException{
        Map result = cloudinary.uploader().destroy(id, ObjectUtils.emptyMap());
        
        return result;
    }
    private File convert(MultipartFile multipartFile) throws IOException{
        File file = new File(multipartFile.getOriginalFilename());
        FileOutputStream fo = new FileOutputStream(file);
        fo.write(multipartFile.getBytes());
        fo.close();
        return file;
    }
}
