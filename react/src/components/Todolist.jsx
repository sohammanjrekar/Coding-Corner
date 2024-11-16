import { useState } from 'react';

const Todolist = () => {
  const [task, setTask] = useState('');
  const [tasks, setTasks] = useState([]);
  const [editingIndex, setEditingIndex] = useState(-1);

  const addTask = () => {
    if (task.trim() !== '') {
      if (editingIndex !== -1) {
        // If editingIndex is not -1, it means we are editing an existing task
        const updatedTasks = [...tasks];
        updatedTasks[editingIndex] = task;
        setTasks(updatedTasks);
        setEditingIndex(-1);
      } else {
        // If editingIndex is -1, it means we are adding a new task
        setTasks([...tasks, task]);
      }
      setTask('');
    }
  };

  const deleteTask = (index) => {
    const updatedTasks = [...tasks];
    updatedTasks.splice(index, 1);
    setTasks(updatedTasks);
  };

  const editTask = (index) => {
    setTask(tasks[index]);
    setEditingIndex(index);
  };

  return (
    <>
      <div className="container mt-5">
        <div className="row justify-content-center">
          <div className="col-md-6">
            <div className="card">
              <div className="card-header">
                <h3 className="text-center">To-Do List</h3>
              </div>

              <div className="card-footer">
                <div className="input-group">
                  <input
                    type="text"
                    className="form-control"
                    id="newTask"
                    placeholder="Add a new task"
                    value={task}
                    onChange={(e) => setTask(e.target.value)}
                  />
                  <div className="input-group-append">
                    <button className="btn btn-primary" onClick={addTask}>
                      {editingIndex !== -1 ? 'Update Task' : 'Add Task'}
                    </button>
                  </div>
                </div>
              </div>

              <div className="card-body">
                <ul className="list-group" id="taskList">
                  {tasks.map((item, index) => (
                    <li key={index} className="list-group-item">
                      {item}
                      <button
                        className="btn btn-danger btn-sm float-right mx-1"
                        onClick={() => deleteTask(index)}
                      >
                        Delete
                      </button>
                      <button
                        className="btn btn-warning btn-sm float-right"
                        onClick={() => editTask(index)}
                      >
                        Edit
                      </button>
                    </li>
                  ))}
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default Todolist;
