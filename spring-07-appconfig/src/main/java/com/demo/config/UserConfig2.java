package com.demo.config;

import com.demo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// ���������Ҳ�ᱻSpring�ӹ��ˣ�ע�ᵽ�����У���Ϊ����������һ��Component
// @Configuration��������һ�������࣬��������֮ǰ��beans.xml
@Configuration
@ComponentScan("com.demo.pojo")
@Import(UserConfig.class)
public class UserConfig2 {
    /**
     * ע��һ��bean�����൱������֮ǰд��һ��bean��ǩ��������������־��൱��
     * bean��ǩ�е�id���ԣ���������ķ���ֵ���൱��bean��ǩ�е�class����
     */
    @Bean
    public User user() {
        // ����Ҫ����ע�뵽bean�Ķ���
        return new User();
    }
}
