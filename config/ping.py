from locust import HttpLocust, TaskSet, task

class WebsiteTasks(TaskSet):
    @task
    def login(self):
        self.client.get("/ping")
        

class WebsiteUser(HttpLocust):
    task_set = WebsiteTasks
    host = "http://192.168.0.117:8889"
    min_wait = 5000
    max_wait = 15000
