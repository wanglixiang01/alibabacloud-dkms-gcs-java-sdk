// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dkms.gcs.sdk.models;

import com.aliyun.tea.NameInMap;
import com.aliyun.tea.TeaModel;

public class GenerateRandomRequest extends DKMSRequest {
    @NameInMap("Length")
    public Integer length;

    public static GenerateRandomRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateRandomRequest self = new GenerateRandomRequest();
        return TeaModel.build(map, self);
    }

    public GenerateRandomRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

}
