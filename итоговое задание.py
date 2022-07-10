import unittest

from selenium import webdriver
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.chrome.service import Service

s=Service('C:/Users/admin/PycharmProjects/pythonProject/chromedriver.exe')


class Search(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome(service=s)
        # 1.Открыть страницу http://google.com/ncr
        self.driver.get("http://google.com/ncr")
    def test_search(self):
        self.driver.maximize_window()
        assert "Google" in self.driver.title
        elem = self.driver.find_element(By.NAME,"q")
        elem.clear()

        # 2.Выполнить поиск слова “selenide”
        elem.send_keys("selenide")
        elem.send_keys(Keys.ENTER)

        # 3.Проверить, что первый результат – ссылка на сайт selenide.org.
        elem = self.driver.find_element(By.XPATH,"//*[@id='rso']/div[1]/div/div/div/div/div/div[1]/a/div/cite")
        if "selenide.org" in elem.text:
            print("Первая ссылка соответствует поисковому запросу")

        # 4.Перейти в раздел поиска изображений
        elem=self.driver.find_element(By.LINK_TEXT, 'Images')
        elem.click();

        # 5.Проверить, что первое изображение неким образом связано с сайтом selenide.org.
        elem=self.driver.find_element(By.XPATH,"//*[@id='islrg']/div[1]/div[1]/a[1]/div[1]/img")
        elem.click();
        try:
            WebDriverWait(self.driver, 5).until(
                EC.presence_of_element_located((By.XPATH, '//*[text() = "selenide.org"]')))
        except TimeoutException:
            raise Exception('Unable to find text in this element after waiting 5 seconds')

        # 6.Вернуться в раздел поиска Все
        elem = self.driver.find_element(By.TAG_NAME,'body').send_keys(Keys.HOME)
        elem = self.driver.find_element(By.LINK_TEXT, 'Все')
        elem.click();

        # 7.Проверить, что первый результат такой же, как и на шаге 3.
        elem = self.driver.find_element(By.XPATH,"//*[@id='rso']/div[1]/div/div/div/div/div/div[1]/a/div/cite")
        if "selenide.org" in elem.text:
            print("первый результат такой же, как и на шаге 3 - это ссылка на selenide.org")
        self.driver.close()

if __name__ == '__main__':
    unittest.main()