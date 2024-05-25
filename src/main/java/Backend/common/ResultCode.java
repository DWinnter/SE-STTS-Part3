package Backend.common;

public enum ResultCode {
    SUCCESS(200,"成功"),
    ERROR(101,"失败"),
    PARAM_ERROR(201,"参数异常"),
    FORMAT_ERROR(301,"日期格式错误，请按yyyy-MM-dd HH-mm-ss格式输入日期");

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String toString() {
        return code + ":" + message;
    }
}
