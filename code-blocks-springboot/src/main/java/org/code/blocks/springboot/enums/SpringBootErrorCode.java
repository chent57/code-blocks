package org.code.blocks.springboot.enums;

import org.code.blocks.common.protocol.enums.ErrorCode;

/**
 * Define Error Code and the corresponding Error Message.
 * @author darwindu
 * @date 2019/4/29
 **/
public enum SpringBootErrorCode implements ErrorCode {

    /**
     * The success.
     */
    SUCCESS(0, "success"),

    ;

    /**
     * error code.
     */
    private int code;

    /**
     * error message.
     */
    private String codeDesc;

    /**
     * Error Code Constructor.
     *
     * @param code The CommonErrorCode
     * @param codeDesc The CommonErrorCode Description
     */
    SpringBootErrorCode(int code, String codeDesc) {
        this.code = code;
        this.codeDesc = codeDesc;
    }

    /**
     * Get the Error Code.
     *
     * @return the CommonErrorCode
     */
    public int getCode() {
        return code;
    }

    /**
     * Set the Error Code.
     *
     * @param code the new CommonErrorCode
     */
    protected void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets the CommonErrorCode Description.
     *
     * @return the CommonErrorCode Description
     */
    public String getCodeDesc() {
        return codeDesc;
    }

    /**
     * Sets the CommonErrorCode Description.
     *
     * @param codeDesc the new CommonErrorCode Description
     */
    protected void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }
}
