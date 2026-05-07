#include <iostream>
#include <string>
#include <list>
#include <vector>
#include <fstream>
#include <sstream>
#include <iomanip>
#include <algorithm>
#include <numeric>
#include <set>
#include <map>

using namespace std;

int main() {
	setlocale(LC_ALL, "Rus");

	const string s = "mama myla ramu";
	stringstream ss(s);
	list<string> text;
	copy(istream_iterator<string>(ss), istream_iterator<string>(), back_inserter(text));
	copy(begin(text), end(text), ostream_iterator<string>(cout, " "));

	cout << endl;

	//������� 1.1
	char ch = 'm';

	auto itb = text.rbegin();
	auto ite = text.rend();

	bool b = true;

	while (b && itb != ite) {
		if ((*itb)[0] == ch) {
			b = false;
			cout << "��������� ����� �� �������� �����: " << *itb << endl;
		}
		else itb++;
	}

	if (b) cout << "����� ���� ���." << endl;

	//������� 1.2

	bool flag = text.size() % 2;

	for (auto it = text.rbegin(); it != text.rend(); it++) {
		if (flag) {
			cout << *it << " ";
			flag = false;
		}
		else flag = true;
	}
	cout << endl;
	//������� 1.3	
	text.sort();

	copy(begin(text), end(text), ostream_iterator<string>(cout, " "));

	cout << endl;

	//������� 2
	ifstream fl("nums.txt");
	if (!fl.is_open())
		cout << "���� �� ������" << endl;
	else {
		cout << setw(10) << "����� ������: " << setw(10) << "��� �������: " << setw(10) << "���� �������: " << endl;
		string line;
		int linecnt = 0;
		int curSum = 0;
		int maxSum = INT_MIN;
		vector<int>V_max;
		while (getline(fl, line)) {
			replace(line.begin(), line.end(), ',', ' ');
			stringstream ss(line);
			vector<int>v;
			copy(istream_iterator<int>(ss), istream_iterator<int>(), back_inserter(v));
			if (v.size()) {

				auto min_V = min_element(v.begin(), v.end());
				auto max_V = max_element(v.begin(), v.end());
				curSum = accumulate(v.begin(), v.end(), 0);
				if (curSum > maxSum) {
					maxSum = curSum;
					V_max = v;
				}

				cout << setw(10) << ++linecnt << setw(10) << *min_V << setw(10) << *max_V << endl;
			}
			else {
				cout << setw(10) << ++linecnt << setw(10) << '-' << setw(10) << '-' << endl;
			}
		}
		fl.close();
		cout << "���� ����� ���������: " << maxSum << endl;
		cout << "������������������: " << endl;

		copy(V_max.begin(), V_max.end(), ostream_iterator<char>(cout, " "));

		cout << endl;
	}
	ifstream file("snp.txt");
	set<string>names;
	set<string>surname;
	set<string>patronymic;
	string str;
	map < string, int> namesCnt;
	if (file.is_open()) {
		while (getline(file, str, ';')) {
			stringstream ss(str);
			string s;
			cin >> s;
			ss >> s; surname.insert(s);
			ss >> s; names.insert(s); namesCnt[s]++;
			ss >> s; patronymic.insert(s);
		}
		file.close();
	}
	
	cout << " ���������� �����: " << endl;
	for (auto s : names) cout << s << endl;
	copy(names.begin(), names.end(), ostream_iterator<string>(cout, " "));
	for (auto p : namesCnt) {
		cout << p.first << " ���������� ���������: " << p.second << endl;
	}
	cout << endl;

	/*������
	ifstream ifs("source.txt");
	if (!ifs.is_open()) {
		cout << "He ���� ������� ���� ������� " << "source.txt" << endl;
		exit(1);
	}
	typedef istream_iterator<string> string_input;
	vector<string> test;
	map<string, int> dictionary;
	copy(string_input(ifs), string_input(), back_inserter(test));
	for (string s : test) {
		++dictionary[s];
	}
	for (auto s : dictionary) {
		cout << s.first << " - " << s.second;
	}*/

	string str2 = "Abc123��E";
	map<char, int> letter_count;
	vector<char>symb;
	copy_if(str2.begin(), str2.end(), back_inserter(symb), [](char ch) {
		return tolower(ch) >= 'a' && tolower(ch) <= 'z';}
	);

	copy(symb.begin(), symb.end(), ostream_iterator<char>(cout, " "));

	cout << endl;

	transform(symb.begin(), symb.end(), symb.begin(), tolower);

	copy(symb.begin(), symb.end(), ostream_iterator<char>(cout, " "));

	cout << endl;

	for (auto s : symb) {
		letter_count[s]++;
	}
	for (auto p : letter_count) {
		cout << p.first << p.second << endl;
	}

	return 0;
}