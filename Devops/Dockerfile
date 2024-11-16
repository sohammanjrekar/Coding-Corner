# Use CentOS as the base image
FROM centos:latest

# Install necessary packages
RUN yum -y update && \
    yum -y install epel-release && \
    yum -y install python3 python3-pip && \
    yum clean all && \
    pip3 install --upgrade pip && \
    pip3 install ansible

# Optional: Install additional tools or dependencies if needed
# RUN yum -y install <additional_packages>

# Set the working directory
WORKDIR /ansible

# Copy your Ansible playbook(s) and inventory file(s) into the image
COPY playbook.yml /ansible/playbook.yml
COPY inventory.ini /ansible/inventory.ini

# Optionally, you can also copy any additional files or roles your playbook may require
# COPY roles/ /ansible/roles/
# COPY files/ /ansible/files/

# Define default command or entrypoint
CMD ["ansible-playbook", "-i", "inventory.ini", "playbook.yml"]
