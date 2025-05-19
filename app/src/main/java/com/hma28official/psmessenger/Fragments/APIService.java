package com.hma28official.psmessenger.Fragments;

import com.hma28official.psmessenger.Notifications.MyResponse;
import com.hma28official.psmessenger.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAjtBnYQk:APA91bGyOnLYA-Mjhh0zJM1UxaBzFRvbigVMARmKiVKj65FwSeSLf5xQ4o0Gu5XCaAZHY0f999YR0om87zn7d3bD6Z3uGhpA76z6sXhnl0gtmDwQ_z9YaFq1j32uJfiSf5OKhVRPCl5h"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
