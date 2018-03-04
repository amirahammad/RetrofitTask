package tasks.com.retrofittask;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Freeware Sys on 04/03/2018.
 */

public class SignUpResponse {
    private String success;
    private  String message;
    private int userId;

    public String getSuccess(){
        return success;
    }
    public  void setSuccess(String success){
    this.success=success;
     }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId=userId;
    }

}
