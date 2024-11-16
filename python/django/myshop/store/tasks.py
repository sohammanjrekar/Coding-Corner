from celery import shared_task
from time import sleep

@shared_task
def send_email_task(user_email):
    sleep(5)  # Simulate email sending delay
    print(f"Email sent to {user_email}")
