from locust import HttpLocust, TaskSet, task

class WebsiteTasks(TaskSet):
    @task
    def login(self):
       with self.client.post("/api/oauth/token",
       data=dict(grant_type="password", username="admin",password="123456", client_id="manager-portal",client_secret="12345"), catch_response=True) as response:
        print(response.json())
        if response.status_code != 200:
            response.failure("Got wrong response {}".format(response.text))


class WebsiteUser(HttpLocust):
    task_set = WebsiteTasks
    host = "http://192.168.0.171"
    min_wait = 5000
    max_wait = 15000
