(*
 *  BOJ 10869번 Pascal 소스 코드
 *  작성자 : 동동매니저 (DDManager)
 *
 *  ※ 실행 결과
 *  사용 메모리 : 340 KB / 262,144 KB
 *  소요 시간 : 0 ms / 1,000 ms
 *
 *  Copyright 2019. DDManager all rights reserved.
 *)

VAR A,B:INT64;
BEGIN
	READ(A,B);
	WRITELN(A+B);
	WRITELN(A-B);
	WRITELN(A*B);
	WRITELN(A DIV B);
	WRITELN(A MOD B);
END.