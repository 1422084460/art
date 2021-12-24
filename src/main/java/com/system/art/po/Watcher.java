package com.system.art.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("Watcher")
public class Watcher {
    private String email;
    private String password;
    private String role;
    private String isWatcher;
}
