package fpoly.duyltph38444.lab5.demo5.delete;

import fpoly.duyltph38444.lab5.demo5.SvrResponseSanPham;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InterfaceDelete {
    @FormUrlEncoded
    @POST("delete.php")
    Call<SvrResponseSanPham> deleteSanPham(
            @Field("MaSP") String MaSP
    );
}
