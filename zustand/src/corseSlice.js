import create from "zustand";
import { devtools, persist } from "zustand/middleware";

// Define your initial state
const initialState = {
  courses: [],
};

// Create the store with devtools and persist middleware
export const courseStore = create(
  persist(
    devtools((set) => ({
      ...initialState,
      addCourse: (course) => {
        set((state) => ({
          courses: [course, ...state.courses],
        }));
      },
      removeCourse: (courseId) => {
        set((state) => ({
          courses: state.courses.filter((c) => c.id !== courseId),
        }));
      },
    })),
    {
      name: "course-store", // Name for the persisted state
      getStorage: () => localStorage, // Storage medium (localStorage, sessionStorage, etc.)
    }
  )
);
