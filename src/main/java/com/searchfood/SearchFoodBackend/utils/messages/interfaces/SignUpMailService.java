package com.searchfood.SearchFoodBackend.utils.messages.interfaces; 

import com.searchfood.SearchFoodBackend.model.data.SignUpMember; 
import com.searchfood.SearchFoodBackend.model.data.StoreInfo; 

public interface SignUpMailService{ 

    public void sendEmail( SignUpMember signupMember ); 
    public void sendEmailCreateStores( String username, StoreInfo storeInfo ); 
} 

