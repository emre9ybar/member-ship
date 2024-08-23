package entity;

import tablemanager.Table;

public class User implements Table {
    private String tableName = "users";
    private String id = "id INT PRIMARY KEY";
    private String uuid = "uuid VARCHAR(128)";
    private String userId = "user_id INT";
    private String planId = "plan_id INT";
    private String startDate = "start_date TIMESTAMP";
    private String endDate = "end_date TIMESTAMP";
    private String renewalDate = "renewal_date TIMESTAMP";
    private String status = "status VARCHAR(20)";
    private String updatedBy = "updated_by VARCHAR(50)";
    private String updatedAt = "updated_at TIMESTAMP";

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public String getTableSchema() {
        return id + ", " +
                uuid + ", " +
                userId + ", " +
                planId + ", " +
                startDate + ", " +
                endDate + ", " +
                renewalDate + ", " +
                status + ", " +
                updatedBy + ", " +
                updatedAt;
    }
}
