package zy01;

public interface ZyService {
    //前置通知
    void bofang();
    //后置通知
    void zanting();
    //环绕通知，转账
    void transMoney();
    void findNo();
}
