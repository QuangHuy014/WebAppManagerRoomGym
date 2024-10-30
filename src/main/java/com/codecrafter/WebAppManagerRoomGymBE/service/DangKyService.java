package com.codecrafter.WebAppManagerRoomGymBE.service;

import com.codecrafter.WebAppManagerRoomGymBE.data.entity.DangKyE;

import java.util.Date;
import java.util.List;

public interface DangKyService {

    DangKyE registerWithDiscount(int maThanhVien, int maGoiTap, int maGoiUuDai);

    DangKyE registerWithoutDiscount(int maThanhVien, int maGoiTap);
    List<DangKyE> getDangKyByParams(Integer maDangKy, Integer maThanhVien, Integer maGoiUuDai, Date ngayDangKy, Date ngayKichHoat, Boolean trangThaiDangKy, Integer maLopHoc, Integer maHoaDon);

     List<DangKyE> getAllDangKy();
}
