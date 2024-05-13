A test project for completing a course from the IBS company for a load tester. 
Task:
  Create a REST web service (compass) using Spring technology, which will determine the direction of light by the entered degrees (from 0 to 359). The reference point will be north - 0 degrees.

POST:
curl -X POST "http://localhost:8080/setDirections" -H "Content-Type: application/json" -d "[{\"name\": \"North\", \"start\": 337, \"end\": 22},{\"name\": \"Northeast\", \"start\": 23, \"end\": 67},{\"name\": \"East\", \"start\": 68, \"end\": 112},{\"name\": \"Southeast\", \"start\": 113, \"end\": 157},{\"name\": \"South\", \"start\": 158, \"end\": 202},{\"name\": \"Southwest\", \"start\": 203, \"end\": 247},{\"name\": \"West\", \"start\": 248, \"end\": 292},{\"name\": \"Northwest\", \"start\": 293, \"end\": 336}]"

GET:
curl -X GET "http://localhost:8080/getDirection?degree={number}"
