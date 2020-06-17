package com.xn.pojo;

import java.io.Serializable;

/**
 * 用于QA传参
 */
public class BaiDuQaAnswerEntity implements Serializable {

    private String	log_id;
    private String	version;
    private String	bot_session;
    private String	bot_id;
    private QaAnswerUtil request;
    public String getLog_id() {
        return log_id;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBot_session() {
        return bot_session;
    }

    public void setBot_session(String bot_session) {
        this.bot_session = bot_session;
    }

    public String getBot_id() {
        return bot_id;
    }

    public void setBot_id(String bot_id) {
        this.bot_id = bot_id;
    }

    public QaAnswerUtil getRequest() {
        return request;
    }

    public void setRequest(QaAnswerUtil request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "BaiDuQaAnswerEntity{" +
                "log_id='" + log_id + '\'' +
                ", version='" + version + '\'' +
                ", bot_session='" + bot_session + '\'' +
                ", bot_id='" + bot_id + '\'' +
                ", request=" + request +
                '}';
    }

    public static class QaAnswerUtil implements Serializable{
        private String	user_id;
        private QaAnswer query_info;
        private Integer bernard_level;
        private String	updates;
        private String	query;
        private String	client_session;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public QaAnswer getQuery_info() {
            return query_info;
        }

        public void setQuery_info(QaAnswer query_info) {
            this.query_info = query_info;
        }

        public Integer getBernard_level() {
            return bernard_level;
        }

        public void setBernard_level(Integer bernard_level) {
            this.bernard_level = bernard_level;
        }

        public String getUpdates() {
            return updates;
        }

        public void setUpdates(String updates) {
            this.updates = updates;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getClient_session() {
            return client_session;
        }

        public void setClient_session(String client_session) {
            this.client_session = client_session;
        }

        @Override
        public String toString() {
            return "QaAnswerUtil{" +
                    "user_id='" + user_id + '\'' +
                    ", query_info=" + query_info +
                    ", bernard_level=" + bernard_level +
                    ", updates='" + updates + '\'' +
                    ", query='" + query + '\'' +
                    ", client_session='" + client_session + '\'' +
                    '}';
        }

        public static class QaAnswer implements Serializable{
            private String	source;
            private String	type;

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            @Override
            public String toString() {
                return "QaAnswer{" +
                        "source='" + source + '\'' +
                        ", type='" + type + '\'' +
                        '}';
            }
        }
    }
}
