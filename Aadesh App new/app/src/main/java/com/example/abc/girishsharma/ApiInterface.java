package com.example.abc.girishsharma;

import com.example.abc.girishsharma.Modal.Comment;
import com.example.abc.girishsharma.Modal.Example;
import com.example.abc.girishsharma.Modal.Example2;
import com.example.abc.girishsharma.Modal.LoginModelData;
import com.example.abc.girishsharma.Modal.VisionExample;
import com.example.abc.girishsharma.Modal.Volunteer;
import com.google.gson.JsonObject;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
    @POST("AppointmentRequest")
    @FormUrlEncoded
    Call<Appointment> postAppointments(
            @Field("PurposeofMeetin") String MeetingPurpose,
            @Field("Name") String Name,
            @Field("Email") String Email,
            @Field("Phone") String Phone,
            @Field("Addressline1") String Addressline1,
            @Field("Addressline2") String Addressline2,
            @Field("City") String City,
            @Field("State") String State,
            @Field("Pincode") String Pincode,
            @Field("ReferenceName") String RefName,
            @Field("RefPost") String RefPost,
            @Field("RefPhone") String RefPhone,
            @Field("profession") String proff
    );

    @GET("frontend/clientquotes/50")
    Call<JsonObject> getClientCode();

    @GET("frontend/events/35/ghj/23/hg/2147483647?show=maps")
    Call<JsonObject> getLatestEvents();

    @GET("frontend/gallery/50")
    Call<Example> getGalleryList();

    @GET("frontend/about/35/abc/2/fgh/22")
    Call<Example2> getAbout();

    @GET("frontend/gallery/50")
    Call<Example> getimage();

    @GET("becomeAVolunteer")
    Call<Volunteer> getDetails();

    @GET("frontend/complaints/comments/2/35/avg/3/abc/3")
    Call<Comment> getComment();

    @GET("frontend/vision/50")
    Call<VisionExample> getVision();

    @Multipart
    @POST("becomeAVolunteer")
    Call<JsonObject> sendDetails(@Part("volunteerID") RequestBody volID,
                                @Part("AppUserID") RequestBody appID,
                                @Part("fname") RequestBody fname,
                                @Part("lname") RequestBody lname,
                                @Part("profession") RequestBody prof,
                                @Part("email") RequestBody email,
                                @Part("phone") RequestBody phone,
                                @Part("address1") RequestBody adr1,
                                @Part("address2") RequestBody adr2,
                                @Part("city") RequestBody city,
                                @Part("state") RequestBody state,
                                @Part("pin") RequestBody pin,
                                @Part("CMSUserAuthenticationID") RequestBody cmID,
                                @Part MultipartBody.Part Pic
//                                @Part("file\"; filename=\"pp.png\" ") RequestBody file
    );

    @POST("registerOrLogin")
    @FormUrlEncoded
    Call<LoginModelData> getLogin(@Field("CMSUsername") String name, @Field("CMSPassword") String pass);


}