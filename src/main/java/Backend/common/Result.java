package Backend.common;

public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    private Result(T data) {
        this.data = data;
    }
    private Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Result(String message) {
        this.message = message;
    }



    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public static <U> Result<U> success(U data) {
        return new Result<>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    public static <T> Result<T> success() {
        return new Result<>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage());
    }

    public static <T> Result<T> success(Integer code,String message) {
        return new Result<>(code,message);
    }

    public static <U> Result<U> error(U data) {
        return new Result<>(ResultCode.ERROR.getCode(),ResultCode.ERROR.getMessage(),data);
    }

    public static <T> Result<T> error() {
        return new Result<>(ResultCode.ERROR.getCode(),ResultCode.ERROR.getMessage());
    }

    public static <T> Result<T> error(Integer code,String message) {
        return new Result<>(code,message);
    }

    public static <T> Result<T> format_error() {
        return new Result<>(ResultCode.FORMAT_ERROR.getCode(), ResultCode.FORMAT_ERROR.getMessage());
    }




}
