from fastapi import APIRouter
from models.note import  Note
from config.db import conn
from schemas.note import noteEntity,notesEntity
from fastapi import FastAPI,Request
from fastapi.responses import HTMLResponse
from fastapi.staticfiles import StaticFiles
from fastapi.templating import Jinja2Templates

note=APIRouter()
templates=Jinja2Templates(directory="templates")

@note.get("/note",response_class=HTMLResponse)
async def read_item(request:Request):
    docs=conn.test.test.find({})
    newDocs = []
    for doc in docs:
        newDocs.append({
            "id": str(doc["_id"]),  # Convert ObjectId to string
            "title": doc['title'],
            "desc": doc['desc'],
            "important": doc['important'],
        })
   
    return templates.TemplateResponse("item.html",{
        "request":request, 
        "newDocs":newDocs})

@note.post("/note",response_class=HTMLResponse)
async def add_note(request:Request):
    form=await request.form()
    formDict=dict(form)
    formDict["important"]=False
    inserted_note =conn.test.test.insert_one(formDict)
    new_note = conn.test.test.find_one({"_id": inserted_note.inserted_id})
    docs=conn.test.test.find({})
    newDocs = []
    for doc in docs:
        newDocs.append({
            "id": str(doc["_id"]),  # Convert ObjectId to string
            "title": doc['title'],
            "desc": doc['desc'],
            "important": doc['important'],
        })
    if new_note:
        return templates.TemplateResponse("item.html", {
            "request": request,"newDocs":newDocs})
    else:
        return {"error": "Failed to insert note"}
      











# from fastapi import FastAPI,Request
# from fastapi.responses import HTMLResponse
# from fastapi.staticfiles import StaticFiles
# from fastapi.templating import Jinja2Templates
# from config.db import conn
# app = FastAPI()
# app.mount("/static",StaticFiles(directory="static"),name="static")
# templates=Jinja2Templates(directory="templates")

# @app.get("/")
# async def root():
#     return {"message": "Hello World"}

# @app.get("/items/{item_id}")
# def read_item(item_id:int,name:str|None="Soham"):
#     return {"item_id":item_id,"name":name}


# @app.get("/note",response_class=HTMLResponse)
# async def read_item(request:Request):
#     docs=conn.test.test.find({})
#     newDocs = []
#     for doc in docs:
#         newDocs.append({
#             "id": str(doc["_id"]),  # Convert ObjectId to string
#             "note": doc['note']
#         })
#     print(newDocs)
#     return templates.TemplateResponse("item.html",{
#         "request":request, 
#         "newDocs":newDocs})

