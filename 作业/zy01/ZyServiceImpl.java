package zy01;

public class ZyServiceImpl implements ZyService {

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
        System.out.println("转账");
    }

    @Override
    public void findNo() {
        int nkjnkj=9/0;
        System.out.println("视频找不见了");
    }
}
