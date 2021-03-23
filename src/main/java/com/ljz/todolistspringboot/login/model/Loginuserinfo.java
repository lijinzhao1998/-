package com.ljz.todolistspringboot.login.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Loginuserinfo implements Serializable {
    private String userId;

    private String userLoginId;

    private String currentPassWord;

    private String useType;

    private String userName;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getCurrentPassWord() {
        return currentPassWord;
    }

    public void setCurrentPassWord(String currentPassWord) {
        this.currentPassWord = currentPassWord;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Loginuserinfo other = (Loginuserinfo) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserLoginId() == null ? other.getUserLoginId() == null : this.getUserLoginId().equals(other.getUserLoginId()))
            && (this.getCurrentPassWord() == null ? other.getCurrentPassWord() == null : this.getCurrentPassWord().equals(other.getCurrentPassWord()))
            && (this.getUseType() == null ? other.getUseType() == null : this.getUseType().equals(other.getUseType()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserLoginId() == null) ? 0 : getUserLoginId().hashCode());
        result = prime * result + ((getCurrentPassWord() == null) ? 0 : getCurrentPassWord().hashCode());
        result = prime * result + ((getUseType() == null) ? 0 : getUseType().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userLoginId=").append(userLoginId);
        sb.append(", currentPassWord=").append(currentPassWord);
        sb.append(", useType=").append(useType);
        sb.append(", userName=").append(userName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}