/*Domain class of table m_prj_invoice*/
package com.mycollab.module.project.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_prj_invoice")
@Alias("Invoice")
public class Invoice extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.id
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.createdTime
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @Column("createdTime")
    private LocalDateTime createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.lastUpdatedTime
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @Column("lastUpdatedTime")
    private LocalDateTime lastupdatedtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.createdUser
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @NotEmpty
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.assignUser
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("assignUser")
    private String assignuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.amount
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @NotNull
    @Column("amount")
    private Double amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.currentId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @Length(max=4, message="Field value is too long")
    @Column("currentId")
    private String currentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.clientId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @Column("clientId")
    private Integer clientid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.contactUserFullName
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @Length(max=100, message="Field value is too long")
    @Column("contactUserFullName")
    private String contactuserfullname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.sAccountId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @NotNull
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.status
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @NotEmpty
    @Length(max=45, message="Field value is too long")
    @Column("status")
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.note
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @Length(max=400, message="Field value is too long")
    @Column("note")
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.type
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @NotEmpty
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.noId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @NotEmpty
    @Length(max=400, message="Field value is too long")
    @Column("noId")
    private String noid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.projectId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @NotNull
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.issueDate
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @NotNull
    @Column("issueDate")
    private LocalDate issuedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_invoice.description
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        Invoice item = (Invoice)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1451, 1683).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.id
     *
     * @return the value of m_prj_invoice.id
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.id
     *
     * @param id the value for m_prj_invoice.id
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.createdTime
     *
     * @return the value of m_prj_invoice.createdTime
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public LocalDateTime getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withCreatedtime(LocalDateTime createdtime) {
        this.setCreatedtime(createdtime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.createdTime
     *
     * @param createdtime the value for m_prj_invoice.createdTime
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setCreatedtime(LocalDateTime createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.lastUpdatedTime
     *
     * @return the value of m_prj_invoice.lastUpdatedTime
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public LocalDateTime getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withLastupdatedtime(LocalDateTime lastupdatedtime) {
        this.setLastupdatedtime(lastupdatedtime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_prj_invoice.lastUpdatedTime
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setLastupdatedtime(LocalDateTime lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.createdUser
     *
     * @return the value of m_prj_invoice.createdUser
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withCreateduser(String createduser) {
        this.setCreateduser(createduser);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.createdUser
     *
     * @param createduser the value for m_prj_invoice.createdUser
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.assignUser
     *
     * @return the value of m_prj_invoice.assignUser
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public String getAssignuser() {
        return assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withAssignuser(String assignuser) {
        this.setAssignuser(assignuser);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.assignUser
     *
     * @param assignuser the value for m_prj_invoice.assignUser
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setAssignuser(String assignuser) {
        this.assignuser = assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.amount
     *
     * @return the value of m_prj_invoice.amount
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withAmount(Double amount) {
        this.setAmount(amount);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.amount
     *
     * @param amount the value for m_prj_invoice.amount
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.currentId
     *
     * @return the value of m_prj_invoice.currentId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public String getCurrentid() {
        return currentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withCurrentid(String currentid) {
        this.setCurrentid(currentid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.currentId
     *
     * @param currentid the value for m_prj_invoice.currentId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setCurrentid(String currentid) {
        this.currentid = currentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.clientId
     *
     * @return the value of m_prj_invoice.clientId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Integer getClientid() {
        return clientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withClientid(Integer clientid) {
        this.setClientid(clientid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.clientId
     *
     * @param clientid the value for m_prj_invoice.clientId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.contactUserFullName
     *
     * @return the value of m_prj_invoice.contactUserFullName
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public String getContactuserfullname() {
        return contactuserfullname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withContactuserfullname(String contactuserfullname) {
        this.setContactuserfullname(contactuserfullname);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.contactUserFullName
     *
     * @param contactuserfullname the value for m_prj_invoice.contactUserFullName
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setContactuserfullname(String contactuserfullname) {
        this.contactuserfullname = contactuserfullname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.sAccountId
     *
     * @return the value of m_prj_invoice.sAccountId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withSaccountid(Integer saccountid) {
        this.setSaccountid(saccountid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.sAccountId
     *
     * @param saccountid the value for m_prj_invoice.sAccountId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.status
     *
     * @return the value of m_prj_invoice.status
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.status
     *
     * @param status the value for m_prj_invoice.status
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.note
     *
     * @return the value of m_prj_invoice.note
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withNote(String note) {
        this.setNote(note);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.note
     *
     * @param note the value for m_prj_invoice.note
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.type
     *
     * @return the value of m_prj_invoice.type
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withType(String type) {
        this.setType(type);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.type
     *
     * @param type the value for m_prj_invoice.type
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.noId
     *
     * @return the value of m_prj_invoice.noId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public String getNoid() {
        return noid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withNoid(String noid) {
        this.setNoid(noid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.noId
     *
     * @param noid the value for m_prj_invoice.noId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setNoid(String noid) {
        this.noid = noid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.projectId
     *
     * @return the value of m_prj_invoice.projectId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withProjectid(Integer projectid) {
        this.setProjectid(projectid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.projectId
     *
     * @param projectid the value for m_prj_invoice.projectId
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.issueDate
     *
     * @return the value of m_prj_invoice.issueDate
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public LocalDate getIssuedate() {
        return issuedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withIssuedate(LocalDate issuedate) {
        this.setIssuedate(issuedate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.issueDate
     *
     * @param issuedate the value for m_prj_invoice.issueDate
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setIssuedate(LocalDate issuedate) {
        this.issuedate = issuedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_invoice.description
     *
     * @return the value of m_prj_invoice.description
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_invoice
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public Invoice withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_invoice.description
     *
     * @param description the value for m_prj_invoice.description
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        createdtime,
        lastupdatedtime,
        createduser,
        assignuser,
        amount,
        currentid,
        clientid,
        contactuserfullname,
        saccountid,
        status,
        note,
        type,
        noid,
        projectid,
        issuedate,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}