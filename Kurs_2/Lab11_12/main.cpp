#include <algorithm>
#include <iostream>
#include <iterator>
#include <vector>
#include <cstring>
#include <utility>
#include <fstream>
#include <sstream>

using namespace std;
int main() {
   setlocale(LC_ALL, "Rus");
   //Lab 11
   //task 1
   //  string source = "duefehh3487382fwefs";
   //  vector<char> str;
   //  copy(source.begin(), source.end(), back_inserter(str)); //подойдет если одно слово
   // // copy(istream_iterator<char>(source), aistream_iterator<char>(), back_inserter(str));
   //  cout << count_if(str.begin(), str.end(), [](char ch){return ch >= '0' && ch <= '9';}) << endl;
   //  //или count_if(str.begin(), str.end(), [](char ch) {return is_digit(ch);}
   //  transform(source.begin(), source.end(), source.begin(), [](unsigned char c){return toupper(c);});
   //  cout << source << endl;
   //  return 0;

   //task 2
   // ifstream fin("words.txt") ;
   // vector<string> words;
   // copy(istream_iterator<string>(fin), istream_iterator<string>(), back_inserter(words));
   // fin.close();
   //
   // int i = 0;
   // transform(words.begin(), words.end(), words.begin(), [&i](string s) {
   //    i++;
   //    rotate(s.rbegin(), s.rbegin() + i % s.size(),s.rend());
   //    return s;
   // });
   // // [&i](string s) - в квадратных скобках указали переменную извне, котрую будем использовать
   //
   // for (auto word : words) {
   //    cout << word << endl;
   // }
   //
   // cout << count_if(words.begin(), words.end(), [](string s){return tolower(s[0]) == tolower(s[s.size() - 1]);}) << endl;
   //
   // //  cout << count_if(str.begin(), str.end(), [](char ch){return ch >= '0' && ch <= '9';}) << endl;

   // vector<int> myvector; //myvector: 10 20 30 40 50
   // for (int i = 1; i < 6; i++) myvector.push_back(i * 10);
   // int myints[]={10,20,80,320,1024};//myints: 10 20 80 320 1024
   // pair<std::vector<int>::iterator, int*> mypair;
   // // using default comparison:
   // mypair = mismatch(myvector.begin(), myvector.end(), myints);
   // cout << "First mismatching elements: " << *mypair.first;
   // cout << " and " << *mypair.second << '\n';
   // // using predicate comparison:
   // mypair = mismatch(myvector.begin(), myvector.end(), myints,
   // [](int x, int y) { return x % 10 == y % 10; });
   // cout << "Second mismatching elements: " << *mypair.first;cout << " and " << *mypair.second << '\n';
   //
   // mypair = mismatch(myvector.begin(), myvector.end(), myints, [](int x, int y) {
   //    return x * x % 3 == y * y % 3;
   // });
   // cout << "Second mismatching elements: " << *mypair.first;cout << " and " << *mypair.second << '\n';

   //task 4
   // string word1 = "hello world";
   // string word2 = "hello baghda";
   // vector<string> vec1;//случай где слов много
   // vector<string> vec2;
   // stringstream ss(word1);
   // stringstream ss1(word2);
   // copy(istream_iterator<string>(ss), istream_iterator<string>(), back_inserter(vec1));
   // copy(istream_iterator<string>(ss1), istream_iterator<string>(), back_inserter(vec2));
   // //copy(istream_iterator<char>(source), aistream_iterator<char>(), back_inserter(str));
   // pair<std::vector<string>::iterator, std::vector<string>::iterator> mypair;
   // auto t = mismatch(vec1.begin(), vec1.end(), vec2.begin());
   // cout << *t.first << " " << *t.second << endl;
   // //исправить
   // auto res2 = mismatch(vec1.begin(), vec1.end(), vec2.begin(),
   //         [](const string& a, const string& b) {
   //             return a.length() == b.length(); // "Совпадение" — это равенство длин
   //         });
   // cout << *res2.first << " " << *res2.second << endl;

   //Lab 12
   //task 1
   int myints[] = { 2,1,3 };
   sort(myints, myints + 3);
   cout << "The 3! possible permutations with 3 elements:\n";
   do {
      cout << myints[0] << ' ' << myints[1] << ' ' << myints[2] << '\n';
   } while (next_permutation(myints, myints + 3));
   cout << "After loop: " << myints[0] << ' ' << myints[1] << ' ' << myints[2] << '\n';

   string str1;
   cin >> str1;
   int count = 1;

   sort(str1.begin(), str1.end());
   vector<string> vec1;
   do {
      vec1.push_back(str1);
      count++;
   }while (next_permutation(str1.begin(), str1.end()));

   cout << "Kolvo perestanovok =" << count << endl;
   for (auto s : vec1) cout << s << endl;

   return 0;

}