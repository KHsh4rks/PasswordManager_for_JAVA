# ■ PasswordManager_for_JAVA

<img src="https://imgur.com/CUQ5uBs.png" alt="サンプル" title="サンプル">

<img src="https://imgur.com/qp0IDFy.png" alt="サンプル" title="サンプル">

職業訓練校で勉強したJava言語をもとに、個人的な学習をかねて作成したポートフォリオです。

内容はシンプルなパスワードマネージャーです。"**MySQLの学習**"がメインとなっています。

上記につき、未実装項目があります。バグやコードの修正案があればコメントを頂けると幸いです。

## 【開発環境】

・Apache NetBeans IDE 19

・Java

・JDK20

・MySQL Workbench 8.0 CE

## 【要件定義】

### 目的
・MySQLの学習

・Javaを利用したMySQLの学習

・Eclipse以外の総合開発環境を触ってみる

### システム方式・構成
・基本的なパスワードマネージャーの機能

・MySQLを利用したデータ運用 (接続、認証、書き込み、読込み)

・パスワードの暗号化  ※ 期間の都合上、未実装

・管理者設定フォーム  ※ 期間の都合上、未実装

### 【MySQL 接続設定】

| 設定 | 内容 |
| --- | --- |
| `ID` | root |
| `パスワード` | rootpass |
| `接続` | localhost:3306 |

### 【MySQL DB設定】

| Schema | 内容 |
| --- | --- |
| `sample_login` | admin , list |


| Table | 内容 |
| --- | --- |
| `admin` | id (VARCHAR100,PK,NN) , password (VARCHAR100,NN) |
| `list` | id (INT,PK,NN,AI) , type (VARCHAR100,NN) , name (VARCHAR100,NN) , username (VARCHAR100,NN) , password (VARCHAR100,NN) , memo (VARCHAR1000,NN) |

| Table 初期値 | id | password |
| --- | --- | --- |
| `admin` | admin | passwrod |
| `list` |  |  |

### スケジュール
2023年11月17日(金) 　要件確認、整理、（開発）

2023年11月18日(土) 　開発

2023年11月19日(日)　テスト、テスト結果に伴う調整

## 【使用ライブラリ】

・JDBC Driver for MySQL (Connector/J) 8.2.0

https://dev.mysql.com/downloads/connector/j/

・FlatLaf demo 3.2.1

https://www.formdev.com/flatlaf/
