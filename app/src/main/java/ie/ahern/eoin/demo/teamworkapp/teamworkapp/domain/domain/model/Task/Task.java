package ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.domain.model.Task;

/**
 * Created by eoin_pc on 12/10/2016.
 */

public class Task {

    private String project_id;
    private String project_name;
    private String order;
    private String created_on;
    private String id;
    private boolean completed;
    private String projectname;
    private String creator_avatar_url;
    private String creator_last_name;
    private String creator_first_name;
    private String due_date;
    private String start_date;
    private boolean has_reminder;
    private String content;

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getCreator_avatar_url() {
        return creator_avatar_url;
    }

    public void setCreator_avatar_url(String creator_avatar_url) {
        this.creator_avatar_url = creator_avatar_url;
    }

    public String getCreator_last_name() {
        return creator_last_name;
    }

    public void setCreator_last_name(String creator_last_name) {
        this.creator_last_name = creator_last_name;
    }

    public String getCreator_first_name() {
        return creator_first_name;
    }

    public void setCreator_first_name(String creator_first_name) {
        this.creator_first_name = creator_first_name;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public boolean isHas_reminder() {
        return has_reminder;
    }

    public void setHas_reminder(boolean has_reminder) {
        this.has_reminder = has_reminder;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

/* "todo-items": [
    {
        "project-id": "23101",
            "order": "2000",
            "comments-count": "0",
            "created-on": "2014-05-08T15:07:23Z",
            "canEdit": true,
            "has-predecessors": "2",
            "id": "439458",
            "completed": false,
            "position": "2000",
            "estimated-minutes": "0",
            "description": "",
            "progress": "0",
            "harvest-enabled": false,
            "responsible-party-lastname": "User",
            "parentTaskId": "12345",
            "company-id": "2",
            "creator-avatar-url": "http://demo1company.teamwork.com/images/avatar.jpg",
            "creator-id": "28726",
            "project-name": "demo",
            "start-date": "20140508",
            "tasklist-private": "0",
            "lockdownId": "",
            "canComplete": true,
            "responsible-party-id": "28726",
            "creator-lastname": "User",
            "has-reminders": true,
            "todo-list-name": "test",
            "has-unread-comments": false,
            "due-date-base": "20140524",
            "private": "0",
            "responsible-party-summary": "Demo U.",
            "status": "new",
            "todo-list-id": "59415",
            "predecessors": [
        {
            "id": "439459",
                "type": "complete"
        }
        ],
        "parent-task": {
        "content": "sample parent task",
                "id": "12345"
    },
        "content": "a task",
            "responsible-party-type": "Person",
            "company-name": "Demo 1 Company",
            "creator-firstname": "Demo",
            "last-changed-on": "2014-05-13T08:12:49Z",
            "due-date": "20140524",
            "has-dependencies": "0",
            "attachments-count": "0",
            "priority": "",
            "responsible-party-firstname": "Demo",
            "viewEstimatedTime": true,
            "responsible-party-ids": "28726",
            "responsible-party-names": "Demo U.",
            "tasklist-lockdownId": "",
            "canLogTime": true,
            "timeIsLogged": "0",
            "tags": [
        {
            "id": 5,
                "name": "api",
                "color": "#b1da34"
        },
        {
            "id": 4,
                "name": "documentation",
                "color": "#A9C3F9"
        }
        ]
    }
    ],
            "STATUS": "OK"*/


}
