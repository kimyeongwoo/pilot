# pilot<h1>
## h2 github start
### h3 ho - woo
#### h4 ho - woo
+ p태


##스트럿츠2에서 세션 받아오기

+스트럿츠2에서는 세션 데이터을 맵으로 관리하기 때문에 받아올때에도 다음과 같이 맵객체에 담아준다. ActionContext con = ActionContext.getContext(); Map session = con.getSession();
##세션에 내용을 입력할 경우

+map에 데이터를 넣는 것과 동일하다. 키값으로는 object를 사용해도 된다. session.put( "키값" , 내용 );
##현재 무슨 세션이 있는지 알고자 할 경우

+키 값을 알고 있는 경우
key값을 알고 있을경우에는 key값으로 바로 가져오면 된다. Object value = session.get("키값");

키 값을 모르고 있는 경우

key값을 모르는 경우에는 세션에 존재하는 모든 키값을 가져와서 해당 데이터를 몽땅 가져온다. Set set = session.keySet(); Iterator ite = set.iterator(); while(ite.hasNext()) { String key = (String) ite.next(); Object value = session.get(key); }
##세션 삭제하기

session에서 해당 키값에 해당하는 데이터를 제거합니다. session.remove("키값");
##JSP 문서에서 세션 확인하기

if문 사이에 세션을 확인하는 코드를 넣어줍니다. <%@ taglib prefix="s" uri="/struts-tags" %> /s:if
