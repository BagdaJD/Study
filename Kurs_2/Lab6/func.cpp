#include "func.h"
bool check_bracket(string s) {
    string left = "{([<";
    string right = "})]>";
    Stack<char>st(s.length());
    char q;int pr;
    try {
        for (char c	: s) {
            if (left.find(c) != string::npos)
                st.push(c);
            else {
                pr = right.find(c);
                if (pr != string::npos) {
                    q = st.pop();
                    if (pr != left.find(q))
                        throw Unpair();
                }
            }
        }
        if (!st.isEmpty()) throw MissRight();
        cout << "������ ����������� �����" << endl;
    }
    catch (stackEmpty) {
        cout << "�� ������� ����� ������" << endl;
    }
    catch (Unpair) {
        cout << "�������� ������" << endl;
    }
    catch (MissRight) {
        cout << "�� ������� ������ ������" << endl;
    }
    return 0;
}
int prior(char c) {
    switch (c) {
        case'(': return 0;
        case')': return 1;
        case '+' :
        case '-': return 2;
        case '*':
        case'/':return 3;
        case'^' : return 4;
        default: return -1;
    }
}
string rpn(string s) {
    string res;
    int n = s.length();
    int p;
    Stack<char>st(n);
    for (int i = 0; i < n; i++) {
        p = prior(s[i]);
        switch (p) {
            case -1:res += s[i]; res += ' '; break;
            case 0: st.push(s[i]); break;
            case 1: while (!st.isEmpty() && prior(st.top())) { res += st.pop(); res += ' ';}
                st.pop(); break;
            default: while (!st.isEmpty() && prior(st.top()) >= p) { res += st.pop(); res += ' '; }
                st.push(s[i]); break;
        }
    }
    while (!st.isEmpty()) { res += st.pop(); res += ' '; }
    return res;
}
int expression(string s) {
    int a;
    int b;
    int n = s.length();
    Stack<int>st(n);
    for (int i = 0; i < n; i++) {
        if (isdigit(s[i]))  st.push(s[i] - '0');
        else if (s[i] == ' ') continue;
        else {
            b = st.pop();
            a = st.pop();
            switch (s[i]) {
                case '+':st.push(a + b); break;
                case '-':st.push(a - b); break;
                case '*':st.push(a * b); break;
                case '/':if (b == 0) throw "lol";
                    st.push(a / b); break;
                default: throw "lol";
            }
        }
    }
    return st.pop();
}