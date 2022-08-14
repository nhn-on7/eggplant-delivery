package com.nhnacademy.eggplantdelivery.dto.request;

import java.util.UUID;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import reactor.util.annotation.Nullable;

/**
 * 주문정보 요청 Dto 입니다.
 *
 * @author 김훈민, 조재철
 * @version 1.0.0
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfoRequestDto {

    @Nullable
    private UUID trackingNo;

    @NotBlank(message = "수취인 이름은 필수 입니다.")
    private String receiverName;

    @NotBlank(message = "수취인 주소는 필수 입니다.")
    private String receiverAddress;

    @NotBlank(message = "수취인 상세주소는 필수 입니다.")
    private String receiverDetailAddress;

    @NotBlank(message = "수취인 휴대번호는 필수 입니다.")
    private String receiverPhone;

    @NotBlank(message = "해당 주문에 대한 주문 번호는 필수 입니다.")
    private String orderNo;

    @Nullable
    private String shopHost;

    public void insertTrackingNo(final UUID createdTrackingNo) {
        this.trackingNo = createdTrackingNo;
    }

    public void insertShopHost(final String shopHost) {
        this.shopHost = shopHost;
    }

}
