package zy02;

import org.springframework.stereotype.Service;


@Service("tvService")
public class TvServiceImpl implements TvService{

    @Override
    public void bofang() {
        System.out.println("播放");
    }

    @Override
    public void zanting() {
        System.out.println("暂停");
    }

    @Override
    public void transMoney() {
        System.out.println("转金币");

    }

    @Override
    public void findNo() {
        int zbd = 9/0;
        System.out.println("视频找不到了");
    }
}
