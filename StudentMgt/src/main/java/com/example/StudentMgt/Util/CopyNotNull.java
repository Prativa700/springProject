package com.example.StudentMgt.Util;

import com.example.StudentMgt.Entity.StudentEntity;

public interface CopyNotNull {
   public static void copyNotNullData(StudentEntity dbData, StudentEntity requestData){
       if (requestData.getName()!= null){
           dbData.setName(requestData.getName());
       }
       if (requestData.getCourse()!= null){
           dbData.setCourse(requestData.getCourse());
       }
       if (requestData.getAddress()!= null){
           dbData.setAddress(requestData.getAddress());
       }
   }
}
