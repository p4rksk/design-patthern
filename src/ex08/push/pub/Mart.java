package ex08.push.pub;

import ex08.push.sub.Customer;

public interface Mart {
    // 1. 등록 (구독자 등록)
    void subscribe(Customer customer);

    // 2. 출판(축구 동영상 업로드)
    void received();

    // 3. 알림 (구독자에게 알림)
    void notify(String msg);

    // 4. 구독 취소 (옵저버 패턴에 필요요소는 아니라 없어도 됨)
    void remove(Customer customer);
}
