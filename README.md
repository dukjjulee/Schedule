POST

    Request
    {
        "title":"Spring 기초 세션"
        "contents":"Spring 기초 강의 듣기"
        "name":"강민영"
        "password":"1014"
    }

    Response
    {
        "id":"KANGMINYONG1234"
        "title":"Spring 기초 세션"
        "contents":"Spring 기초 강의 듣기"
        "name":"강민영"
        "createdAt":"2025-08-01T15:00:00"
        "modifiedAt":"2025-08-01T15:00:00"
    }



전체 일정 조회
GET
[
    {
        "id":"MINYONG1234"
        "title":"Spring 기초 세션"
        "contents":"Spring 기초 강의 듣기"
        "name":"강민영"
        "createdAt":"2025-08-01T15:00:00"
        "modifiedAt":"2025-08-01T15:00:00"
    }
]


선택 일정 조회
GET
Request
{
    "title":"Spring 기초 세션"
    "name":Spring 기초 강의 듣기"
}

{
    "id":"MINYONG1234"
    "title":"Spring 기초 세션"
    "contents":"Spring 기초 강의 듣기"
    "name":"강민영"
    "createdAt":"2025-08-01T15:00:00"
    "modifiedAt":"2025-08-01T15:00:00"
}

PUT

Request
{
    "title":"Spring 기초 세션"
    "name":Spring 기초 강의 듣기"
    "password":"1014"
}
Response
{
    "ID":"MINYONG1234"
    "title":"Spring 기초 세션"
    "contents":"Spring 기초 강의 듣기"
    "name":"강민영"
    "createdAt":"2025-08-01T15:00:00"
    "modifiedAt":"2025-08-01T15:00:00"
}
DELETE

Request
{
    "비밀번호":"1014"
}
Response
{
    "메시지":"일정이 삭제 되었습니다."
}



