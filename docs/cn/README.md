# MaxLeap-Demo-Support-Android

## 简介

Support 是 MaxLeap SDK 的一个 Sample，该项目依赖于 MaxLeap 的基础模块和 Helpcenter 模块。通过该应用你可以学习和了解获取用户反馈的相关操作。

## 效果

![capture](../../capture/support.gif)

## 使用

1. 打开 Android Studio 或 IDEA ，点击菜单项 `File -> Open ` 选择 `setting.gradle` 文件导入工程
2. 打开 `App.java` 文件，使用你自己的 `APP Id` 和 `API KEY` 替换该文件中已定义的同名常量。

## 配置

### 显示 Faq 画面

```java
MLHelpCenter.openFaqs(context);
```

### 显示 Issue 画面

```language
MLHelpCenter.openConversation(context);
```

### 消息设置

默认应用进入前台时，一旦发现服务器上有新消息，应用会自动弹出对话框提示用户查看新消息。如果你希望关闭这个功能，可以在 `App.Java` 中添加如下代码：

```java
MLHelpCenter.allowAlertNewMessage(false)
```

### 获取未读消息数目

你可以在程序的任何位置调用以下接口来获取未读消息数目，没有新消息时会返回 `0`，网络异常为返回 `-1`。

```java
MLHelpCenter.getMessageCountInBackground(new CountCallback() {
    @Override
    public void done(int count, MLException e) {
		if (count > 0){
        	// do something
        }
    }
});
```
